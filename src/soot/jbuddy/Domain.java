/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version: 1.3.17u-20021128-1508
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package soot.jbuddy;


public class Domain {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Domain(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      JBuddyJNI.delete_Domain(swigCPtr);
      swigCMemOwn = false;
    }
    swigCPtr = 0;
  }

  protected static long getCPtr(Domain obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public void setRealsize(int realsize) {
    JBuddyJNI.set_Domain_realsize(swigCPtr, realsize);
  }

  public int getRealsize() {
    return JBuddyJNI.get_Domain_realsize(swigCPtr);
  }

  public void setBinsize(int binsize) {
    JBuddyJNI.set_Domain_binsize(swigCPtr, binsize);
  }

  public int getBinsize() {
    return JBuddyJNI.get_Domain_binsize(swigCPtr);
  }

  public void setIvar(SWIGTYPE_p_int ivar) {
    JBuddyJNI.set_Domain_ivar(swigCPtr, SWIGTYPE_p_int.getCPtr(ivar));
  }

  public SWIGTYPE_p_int getIvar() {
    long cPtr = JBuddyJNI.get_Domain_ivar(swigCPtr);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void setVar(int var) {
    JBuddyJNI.set_Domain_var(swigCPtr, var);
  }

  public int getVar() {
    return JBuddyJNI.get_Domain_var(swigCPtr);
  }

  public Domain() {
    this(JBuddyJNI.new_Domain(), true);
  }

}