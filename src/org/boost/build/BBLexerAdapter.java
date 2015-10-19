// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build;

import com.intellij.lexer.FlexAdapter;
import java.io.Reader;

public class BBLexerAdapter extends FlexAdapter
{
    public BBLexerAdapter() {
        super(new BBLexer((Reader) null));
    }
}
