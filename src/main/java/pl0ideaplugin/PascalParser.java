// This is a generated file. Not intended for manual editing.
package pl0ideaplugin;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static pl0ideaplugin.psi.PascalTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PascalParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return program(b, l + 1);
  }

  /* ********************************************************** */
  // 'const' ident '=' number (',' ident ' = ' number) * ';'
  //     | 'var' ident (',' ident) * ';'
  //     | ('procedure' ident ';' block ';') * statement
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    r = block_0(b, l + 1);
    if (!r) r = block_1(b, l + 1);
    if (!r) r = block_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'const' ident '=' number (',' ident ' = ' number) * ';'
  private static boolean block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "const");
    r = r && consumeToken(b, IDENT);
    r = r && consumeToken(b, "=");
    r = r && consumeToken(b, NUMBER);
    r = r && block_0_4(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' ident ' = ' number) *
  private static boolean block_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!block_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_0_4", c)) break;
    }
    return true;
  }

  // ',' ident ' = ' number
  private static boolean block_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, IDENT);
    r = r && consumeToken(b, " = ");
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'var' ident (',' ident) * ';'
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "var");
    r = r && consumeToken(b, IDENT);
    r = r && block_1_2(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' ident) *
  private static boolean block_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!block_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_1_2", c)) break;
    }
    return true;
  }

  // ',' ident
  private static boolean block_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('procedure' ident ';' block ';') * statement
  private static boolean block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_2_0(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('procedure' ident ';' block ';') *
  private static boolean block_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!block_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_2_0", c)) break;
    }
    return true;
  }

  // 'procedure' ident ';' block ';'
  private static boolean block_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "procedure");
    r = r && consumeToken(b, IDENT);
    r = r && consumeToken(b, ";");
    r = r && block(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'odd' expression
  //     | expression ('=' | '#' | '<' | '<=' | '>' | '>=') expression
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = condition_0(b, l + 1);
    if (!r) r = condition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'odd' expression
  private static boolean condition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "odd");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression ('=' | '#' | '<' | '<=' | '>' | '>=') expression
  private static boolean condition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && condition_1_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' | '#' | '<' | '<=' | '>' | '>='
  private static boolean condition_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_1_1")) return false;
    boolean r;
    r = consumeToken(b, "=");
    if (!r) r = consumeToken(b, "#");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, ">=");
    return r;
  }

  /* ********************************************************** */
  // ('+' | '-') term [('+' | '-') term ]
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    r = r && term(b, l + 1);
    r = r && expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '+' | '-'
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r;
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    return r;
  }

  // [('+' | '-') term ]
  private static boolean expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_2")) return false;
    expression_2_0(b, l + 1);
    return true;
  }

  // ('+' | '-') term
  private static boolean expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_2_0_0(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+' | '-'
  private static boolean expression_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    return r;
  }

  /* ********************************************************** */
  // ident | number | '(' expression ')'
  public static boolean factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FACTOR, "<factor>");
    r = consumeToken(b, IDENT);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = factor_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' expression ')'
  private static boolean factor_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // block "."
  static boolean program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ident ':=' expression
  //     | ident ':=' 'call' ident
  //     | '?' ident
  //     | '!' expression
  //     | 'begin' statement (';' statement) * 'end'
  //     | 'if' condition 'do' statement
  //     | 'while' condition 'do' statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_0(b, l + 1);
    if (!r) r = statement_1(b, l + 1);
    if (!r) r = statement_2(b, l + 1);
    if (!r) r = statement_3(b, l + 1);
    if (!r) r = statement_4(b, l + 1);
    if (!r) r = statement_5(b, l + 1);
    if (!r) r = statement_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ident ':=' expression
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && consumeToken(b, ":=");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ident ':=' 'call' ident
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && consumeToken(b, ":=");
    r = r && consumeToken(b, "call");
    r = r && consumeToken(b, IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '?' ident
  private static boolean statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "?");
    r = r && consumeToken(b, IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '!' expression
  private static boolean statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "!");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'begin' statement (';' statement) * 'end'
  private static boolean statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "begin");
    r = r && statement(b, l + 1);
    r = r && statement_4_2(b, l + 1);
    r = r && consumeToken(b, "end");
    exit_section_(b, m, null, r);
    return r;
  }

  // (';' statement) *
  private static boolean statement_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_4_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement_4_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_4_2", c)) break;
    }
    return true;
  }

  // ';' statement
  private static boolean statement_4_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_4_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'if' condition 'do' statement
  private static boolean statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "if");
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, "do");
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'while' condition 'do' statement
  private static boolean statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "while");
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, "do");
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // factor [ ('*' | '/') factor ]
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = factor(b, l + 1);
    r = r && term_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ('*' | '/') factor ]
  private static boolean term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1")) return false;
    term_1_0(b, l + 1);
    return true;
  }

  // ('*' | '/') factor
  private static boolean term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = term_1_0_0(b, l + 1);
    r = r && factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' | '/'
  private static boolean term_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "/");
    return r;
  }

}
