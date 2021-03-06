/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class FactSet extends BaseCardElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FactSet(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.FactSet_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FactSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_FactSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FactSet() {
    this(AdaptiveCardObjectModelJNI.new_FactSet__SWIG_0(), true);
  }

  public FactSet(Spacing spacing, boolean separation) {
    this(AdaptiveCardObjectModelJNI.new_FactSet__SWIG_1(spacing.swigValue(), separation), true);
  }

  public FactSet(Spacing spacing, boolean separation, FactVector facts) {
    this(AdaptiveCardObjectModelJNI.new_FactSet__SWIG_2(spacing.swigValue(), separation, FactVector.getCPtr(facts), facts), true);
  }

  public SWIGTYPE_p_Json__Value SerializeToJsonValue() {
    return new SWIGTYPE_p_Json__Value(AdaptiveCardObjectModelJNI.FactSet_SerializeToJsonValue(swigCPtr, this), true);
  }

  public FactVector GetFacts() {
    return new FactVector(AdaptiveCardObjectModelJNI.FactSet_GetFacts__SWIG_0(swigCPtr, this), false);
  }

  public static FactSet dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.FactSet_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new FactSet(cPtr, true);
  }

}
