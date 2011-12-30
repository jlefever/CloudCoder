// CloudCoder - a web-based pedagogical programming environment
// Copyright (C) 2011, Jaime Spacco <jspacco@knox.edu>
// Copyright (C) 2011, David H. Hovemeyer <dhovemey@ycp.edu>
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

package org.cloudcoder.app.shared.model;

import java.io.Serializable;

/**
 * Problem and (optional) SubscriptionReceipt.
 * This object is used to convey information about a problem and a
 * summary of the user's work on the problem.
 * 
 * @author David Hovemeyer
 */
public class ProblemAndSubscriptionReceipt implements Serializable {
	private static final long serialVersionUID = 1L;

	private Problem problem;
	private SubmissionReceipt receipt;
	
	public ProblemAndSubscriptionReceipt() {
		
	}
	
	public ProblemAndSubscriptionReceipt(Problem problem, SubmissionReceipt receipt) {
		this.problem = problem;
		this.receipt = receipt;
	}
	
	/**
	 * @return the problem
	 */
	public Problem getProblem() {
		return problem;
	}
	
	/**
	 * @return the receipt
	 */
	public SubmissionReceipt getReceipt() {
		return receipt;
	}
}
