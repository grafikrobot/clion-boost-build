// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.boost.build.language.BBLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BBFileType extends LanguageFileType
{
    public static final BBFileType INSTANCE = new BBFileType();

    private BBFileType() {
        super(BBLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Boost.Build file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Boost.Build language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "jam";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return BBIcons.FILE;
    }
}
