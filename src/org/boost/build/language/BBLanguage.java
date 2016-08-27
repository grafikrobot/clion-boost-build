// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build.language;

import com.intellij.lang.Language;

public class BBLanguage extends Language
{
    public static final BBLanguage INSTANCE = new BBLanguage();

    private BBLanguage() {
        super("Boost.Build");
    }
}
