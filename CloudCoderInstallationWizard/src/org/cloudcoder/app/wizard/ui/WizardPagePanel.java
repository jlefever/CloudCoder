package org.cloudcoder.app.wizard.ui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import org.cloudcoder.app.wizard.model.IValue;
import org.cloudcoder.app.wizard.model.Page;

public class WizardPagePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private Page page;
	private List<IPageField> fields;
	private Runnable changeCallback;
	
	public WizardPagePanel() {
		fields = new ArrayList<IPageField>();
		setLayout(new FlowLayout());

		// Callback to execute when UI values change -
		// used to update selective enablement.
		this.changeCallback = new Runnable() {
			@Override
			public void run() {
				updateSelectiveEnablement();
			}
		};
	}
	
	/**
	 * Get a version of the {@link Page} with updated values
	 * from the UI fields.
	 * 
	 * @return {@link Page} containing current UI field values
	 */
	public Page getCurrentValues() {
		Page current = page.clone();
		for (int i = 0; i < page.getNumValues(); i++) {
			current.set(i, fields.get(i).getCurrentValue());
		}
		return current;
	}

	public void setPage(Page page) {
		this.page = page;
		for (IValue v : page) {
			IPageField field = PageFieldFactory.createForValue(v);
			fields.add(field);
			Component component = field.asComponent();
			component.setPreferredSize(new Dimension(720, field.getFieldHeight()));
			add(component);
			field.setChangeCallback(this.changeCallback);
		}
		updateSelectiveEnablement();
	}

	public IPageField getField(int index) {
		return fields.get(index);
	}

	public void markAllValid() {
		for (IPageField field : fields) {
			field.markValid();
		}
	}

	private void updateSelectiveEnablement() {
		if (page == null) {
			return;
		}
		Page current = getCurrentValues();
		// Do selective enablement based on current values
		for (int i = 0; i < current.getNumValues(); i++) {
			fields.get(i).setSelectiveEnablement(current.isEnabled(current.get(i).getName()));
		}
	}
}