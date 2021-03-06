/*
 * Copyright (c) 2003, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.xml.rpc;

/** The <code>javax.xml.rpc.JAXRPCException</code> is thrown from 
 *  the core JAX-RPC APIs to indicate an exception related to the 
 *  JAX-RPC runtime mechanisms.
 *
 *  @version 1.0
 *  @author  Rahul Sharma
**/

public class JAXRPCException extends java.lang.RuntimeException {
  
  private Throwable cause;

  /** Constructs a new exception with <code>null</code> as its 
   *  detail message. The cause is not initialized.
  **/
  public JAXRPCException() { 
    super();
    this.cause = null;
  }

  /** Constructs a new exception with the specified detail 
   *  message.  The cause is not initialized.
   *  @param message The detail message which is later 
   *                 retrieved using the getMessage method
  **/
  public JAXRPCException(String message) {
    super(message);
    this.cause = null;
  }

  /** Constructs a new exception with the specified detail 
   *  message and cause.
   *
   *  @param message The detail message which is later retrieved
   *                 using the getMessage method
   *  @param cause   The cause which is saved for the later
   *                 retrieval throw by the getCause method 
  **/ 
  public JAXRPCException(String message, Throwable cause) {
    super(message);
    this.cause = cause;
  }

  /** Constructs a new JAXRPCException with the specified cause
   *  and a detail message of <tt>(cause==null ? null : 
   *  cause.toString())</tt> (which typically contains the 
   *  class and detail message of <tt>cause</tt>).
   *
   *  @param cause   The cause which is saved for the later
   *                 retrieval throw by the getCause method.
   *                 (A <tt>null</tt> value is permitted, and
   *                 indicates that the cause is nonexistent or
     *               unknown.)
  **/ 
  public JAXRPCException(Throwable cause) {
    super(cause==null ? null : cause.toString());
    this.cause = cause;
  }

  /** Gets the Linked cause
   * 
   *  @return The cause of this Exception or <code>null</code>
   *          if the cause is noexistent or unknown
  **/
  public Throwable getLinkedCause() {
    return this.cause;
  }
}
