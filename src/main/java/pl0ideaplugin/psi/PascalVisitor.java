// This is a generated file. Not intended for manual editing.
package pl0ideaplugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class PascalVisitor extends PsiElementVisitor {

  public void visitBlock(@NotNull PascalBlock o) {
    visitPsiElement(o);
  }

  public void visitCondition(@NotNull PascalCondition o) {
    visitPsiElement(o);
  }

  public void visitExpression(@NotNull PascalExpression o) {
    visitPsiElement(o);
  }

  public void visitFactor(@NotNull PascalFactor o) {
    visitPsiElement(o);
  }

  public void visitStatement(@NotNull PascalStatement o) {
    visitPsiElement(o);
  }

  public void visitTerm(@NotNull PascalTerm o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
