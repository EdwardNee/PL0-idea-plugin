// This is a generated file. Not intended for manual editing.
package pl0ideaplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PascalStatement extends PsiElement {

  @Nullable
  PascalCondition getCondition();

  @Nullable
  PascalExpression getExpression();

  @NotNull
  List<PascalStatement> getStatementList();

  @Nullable
  PsiElement getId();

}
