// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build.language.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.boost.build.language.BBLanguage;

public class BBTokenType extends IElementType
{
    public BBTokenType(@NotNull @NonNls String debugName) {
        super(debugName, BBLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "BBTokenType." + super.toString();
    }
}
