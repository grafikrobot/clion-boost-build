// Copyright Rene Rivera 2015-2016
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build.language;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.MergingLexerAdapter;
import com.intellij.psi.tree.TokenSet;
import org.boost.build.language.BBLexerBase;


class BBLexer extends MergingLexerAdapter {
  public BBLexer() {
    super(new FlexAdapter(new BBLexerBase()), TokenSet.orSet(BBParserDefinition.COMMENTS, BBParserDefinition.WHITE_SPACES));
  }
}
