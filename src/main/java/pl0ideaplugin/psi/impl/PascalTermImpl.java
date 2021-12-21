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

public class PascalTermImpl extends ASTWrapperPsiElement implements PascalTerm {

  public PascalTermImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PascalVisitor visitor) {
    visitor.visitTerm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PascalVisitor) accept((PascalVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PascalFactor> getFactorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PascalFactor.class);
  }

}
