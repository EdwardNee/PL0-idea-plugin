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

public class PascalBlockImpl extends ASTWrapperPsiElement implements PascalBlock {

  public PascalBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PascalVisitor visitor) {
    visitor.visitBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PascalVisitor) accept((PascalVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PascalBlock> getBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PascalBlock.class);
  }

  @Override
  @Nullable
  public PascalStatement getStatement() {
    return findChildByClass(PascalStatement.class);
  }

}
