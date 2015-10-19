// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;
import org.boost.build.BBFileType;
import org.boost.build.BBLanguage;

public class BBFile extends PsiFileBase
{
    public BBFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, BBLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return BBFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Boost.Build File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
