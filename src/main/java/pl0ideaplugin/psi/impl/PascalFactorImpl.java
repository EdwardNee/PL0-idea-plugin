// This is a generated file. Not intended for manual editing.
package pl0ideaplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static pl0ideaplugin.psi.PascalTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import pl0ideaplugin.psi.*;

public class PascalFactorImpl extends ASTWrapperPsiElement implements PascalFactor {

  public PascalFactorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PascalVisitor visitor) {
    visitor.visitFactor(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PascalVisitor) accept((PascalVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PascalExpression getExpression() {
    return findChildByClass(PascalExpression.class);
  }

}
