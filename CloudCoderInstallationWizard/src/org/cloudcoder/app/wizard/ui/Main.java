package org.cloudcoder.app.wizard.ui;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.cloudcoder.app.wizard.model.Document;
import org.cloudcoder.app.wizard.model.DocumentFactory;

public class Main {
	public static void main(String[] args) throws IOException {
		// Hijack System.out and System.err
		LogPanel.createInstance();
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					JFrame frame = new JFrame("CloudCoder installation wizard");
					
					Document document = DocumentFactory.create();
					
					WizardTopLevelPanel panel = new WizardTopLevelPanel();
					panel.setDocument(document);
					
					frame.setResizable(false);
					frame.setContentPane(panel);
					frame.pack();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // should have a close dialog
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Throwable e) {
					LogPanel.realErr.println("Error launching UI: " + e.toString());
					e.printStackTrace(LogPanel.realErr);
				}
			}
		});
	}
}
