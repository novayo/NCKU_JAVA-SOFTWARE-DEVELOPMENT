package com.demo;

import com.demo.utils.Boolean;
import com.demo.utils.ConditionalOperator;
import com.demo.utils.MultiwayIfElse;
import com.demo.utils.SelectionStatements;
import com.demo.utils.StringCompare;
import com.demo.utils.SwitchStatement;
import com.demo.utils.WhileForDoWhile;

public class Demo {

	public static void main(String[] args) {
		SelectionStatements selectionStatements = new SelectionStatements();
		//selectionStatements.Beep();
		
		MultiwayIfElse multiwayIfElse = new MultiwayIfElse();
		//multiwayIfElse.Beep();
		
		SwitchStatement switchStatement = new SwitchStatement();
		//switchStatement.Beep();
		
		ConditionalOperator conditionalOperator = new ConditionalOperator();
		//conditionalOperator.Beep();
		
		StringCompare stringCompare = new StringCompare();
		//stringCompare.Beep();
		
		Boolean boolean1 = new Boolean();
		//boolean1.Beep();
		
		WhileForDoWhile whileForDoWhile = new WhileForDoWhile();
		whileForDoWhile.Beep();
	}

}
