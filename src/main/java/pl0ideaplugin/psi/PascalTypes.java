// This is a generated file. Not intended for manual editing.
package pl0ideaplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import pl0ideaplugin.psi.impl.*;

public interface PascalTypes {

  IElementType BLOCK = new PascalElementType("BLOCK");
  IElementType CONDITION = new PascalElementType("CONDITION");
  IElementType EXPRESSION = new PascalElementType("EXPRESSION");
  IElementType FACTOR = new PascalElementType("FACTOR");
  IElementType STATEMENT = new PascalElementType("STATEMENT");
  IElementType TERM = new PascalElementType("TERM");

  IElementType IDENT = new PascalTokenType("ident");
  IElementType NUMBER = new PascalTokenType("number");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BLOCK) {
        return new PascalBlockImpl(node);
      }
      else if (type == CONDITION) {
        return new PascalConditionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new PascalExpressionImpl(node);
      }
      else if (type == FACTOR) {
        return new PascalFactorImpl(node);
      }
      else if (type == STATEMENT) {
        return new PascalStatementImpl(node);
      }
      else if (type == TERM) {
        return new PascalTermImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
