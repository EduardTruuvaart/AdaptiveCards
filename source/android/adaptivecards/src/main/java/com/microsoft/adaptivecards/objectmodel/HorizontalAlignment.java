/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public final class HorizontalAlignment {
  public final static HorizontalAlignment Left = new HorizontalAlignment("Left", AdaptiveCardObjectModelJNI.HorizontalAlignment_Left_get());
  public final static HorizontalAlignment Center = new HorizontalAlignment("Center");
  public final static HorizontalAlignment Right = new HorizontalAlignment("Right");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static HorizontalAlignment swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + HorizontalAlignment.class + " with value " + swigValue);
  }

  private HorizontalAlignment(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private HorizontalAlignment(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private HorizontalAlignment(String swigName, HorizontalAlignment swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static HorizontalAlignment[] swigValues = { Left, Center, Right };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

