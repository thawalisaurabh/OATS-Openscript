//WARNING!
//This file was created by Oracle OpenScript.
//Don't change it.

package lib.myCompany.myTeam;

import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;
import oracle.oats.scripting.modules.adf.api.*;
import oracle.oats.scripting.modules.adf.api.elements.ADFTreeTable;
import oracle.oats.scripting.modules.basic.api.internal.FuncLibraryWrapper;
import oracle.oats.scripting.modules.basic.api.exceptions.AbstractScriptException;

public class DriverLibrary extends FuncLibraryWrapper
{

	public void initialize() throws AbstractScriptException {
		checkInit();
		callFunction("initialize");
	}

	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws AbstractScriptException {
		checkInit();
		callFunction("run");
	}

	public void finish() throws AbstractScriptException {
		checkInit();
		callFunction("finish");
	}

	public int addTwoWholeNumbers(int num1, int num2)
			throws AbstractScriptException {
		checkInit();
		return (Integer) callFunction("addTwoWholeNumbers", num1, num2);
	}

	public int divideWholeNumbers(int numerator, int denominator)
			throws AbstractScriptException {
		checkInit();
		return (Integer) callFunction("divideWholeNumbers", numerator,
				denominator);
	}

}

