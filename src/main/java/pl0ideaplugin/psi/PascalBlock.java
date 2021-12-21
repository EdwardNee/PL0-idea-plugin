// This is a generated file. Not intended for manual editing.
package pl0ideaplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PascalBlock extends PsiElement {

  @NotNull
  List<PascalBlock> getBlockList();

  @NotNull
  PascalStatement getStatement();

}
