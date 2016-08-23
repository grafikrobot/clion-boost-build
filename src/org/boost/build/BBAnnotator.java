package org.boost.build;
import com.intellij.lang.annotation.*;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class BBAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement o, @NotNull AnnotationHolder holder) {
        if (!o.isValid()) return;
    }
}
