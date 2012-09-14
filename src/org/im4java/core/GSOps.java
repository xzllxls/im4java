/**************************************************************************
/* This class adds all the GS methods to an Operation.
/*
/* Copyright (c) 2009 by Bernhard Bablok (mail@bablokb.de)
/*
/* This program is free software; you can redistribute it and/or modify
/* it under the terms of the GNU Library General Public License as published
/* by  the Free Software Foundation; either version 2 of the License or
/* (at your option) any later version.
/*
/* This program is distributed in the hope that it will be useful, but
/* WITHOUT ANY WARRANTY; without even the implied warranty of
/* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
/* GNU Library General Public License for more details.
/*
/* You should have received a copy of the GNU Library General Public License
/* along with this program; see the file COPYING.LIB.  If not, write to
/* the Free Software Foundation Inc., 59 Temple Place - Suite 330,
/* Boston, MA  02111-1307 USA
/**************************************************************************/

package org.im4java.core;

/**
   This class subclasses Operation and adds methods for all commandline
   options of gs.

   <p>This class is automatically generated by the source-code generator of
   im4java.</p>

   @version $Revision: 1.14 $
   @author  $Author: bablokb $
*/

public class GSOps extends Operation {

  //////////////////////////////////////////////////////////////////////////////

  /**
     The protected Constructor. You should only use subclasses of GSOps.
  */

  protected GSOps() {
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -v to the gs commandline
     (see the documentation of gs for details).
  */

  public GSOps version() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-v");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -dAlignToPixels to the gs commandline
     (see the documentation of gs for details).
  */

  public GSOps alignToPixels(Integer size) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-dAlignToPixels");

    if (size != null) {
      buf.append(size.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -dBackgroundColor to the gs commandline
     (see the documentation of gs for details).
  */

  public GSOps backgroundColor(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-dBackgroundColor");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -dEPSCrop to the gs commandline
     (see the documentation of gs for details).
  */

  public GSOps epsCrop() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-dEPSCrop");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -dMaxBitmap to the gs commandline
     (see the documentation of gs for details).
  */

  public GSOps maxBitmap(Integer size) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-dMaxBitmap");

    if (size != null) {
      buf.append(size.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -dTextAlphaBits= to the gs commandline
     (see the documentation of gs for details).
  */

  public GSOps textAlphaBits(Integer bits) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("-dTextAlphaBits=");

    if (bits != null) {
      buf.append(bits.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -dGraphicsAlphaBits= to the gs commandline
     (see the documentation of gs for details).
  */

  public GSOps graphicsAlphaBits(Integer bits) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("-dGraphicsAlphaBits=");

    if (bits != null) {
      buf.append(bits.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -dUseCropBox to the gs commandline
     (see the documentation of gs for details).
  */

  public GSOps usePdfCropBox() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-dUseCropBox");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -dUseTrimBox to the gs commandline
     (see the documentation of gs for details).
  */

  public GSOps usePdfTrimBox() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-dUseTrimBox");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -o to the gs commandline
     (see the documentation of gs for details).
  */

  public GSOps outputFile(String outputFile) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-o");

    if (outputFile != null) {
      buf.append(outputFile.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -sDEVICE= to the gs commandline
     (see the documentation of gs for details).
  */

  public GSOps outputDevice(String deviceName) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("-sDEVICE=");

    if (deviceName != null) {
      buf.append(deviceName.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -r to the gs commandline
     (see the documentation of gs for details).
  */

  public GSOps resolution(Double density) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("-r");

    if (density != null) {
      buf.append(density.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }


}
