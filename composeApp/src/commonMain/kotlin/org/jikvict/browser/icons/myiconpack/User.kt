package org.jikvict.browser.icons.myiconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jikvict.browser.theme.LightTheme

val User: ImageVector
    @Composable
    get() {
        val onSurfaceColor = MaterialTheme.colorScheme.onSurface
        val tertiaryContainerColor = MaterialTheme.colorScheme.tertiaryContainer
        return remember(onSurfaceColor, tertiaryContainerColor) {
            Builder(
                name = "User",
                defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp,
                viewportWidth = 16.0f,
                viewportHeight = 16.0f,
            ).apply {
                path(
                    fill = SolidColor(tertiaryContainerColor),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(8.0f, 7.0f)
                    curveTo(9.656f, 7.0f, 11.0f, 5.657f, 11.0f, 4.0f)
                    curveTo(11.0f, 2.343f, 9.656f, 1.0f, 8.0f, 1.0f)
                    curveTo(6.343f, 1.0f, 5.0f, 2.343f, 5.0f, 4.0f)
                    curveTo(5.0f, 5.657f, 6.343f, 7.0f, 8.0f, 7.0f)
                    close()
                }
                path(
                    fill = SolidColor(tertiaryContainerColor),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(2.103f, 13.008f)
                    curveTo(2.399f, 11.303f, 3.548f, 8.0f, 8.0f, 8.0f)
                    curveTo(12.452f, 8.0f, 13.6f, 11.303f, 13.897f, 13.008f)
                    curveTo(13.991f, 13.552f, 13.552f, 14.0f, 13.0f, 14.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.447f, 14.0f, 2.008f, 13.552f, 2.103f, 13.008f)
                    close()
                }
                path(
                    fill = SolidColor(onSurfaceColor),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd,
                ) {
                    moveTo(11.0f, 4.0f)
                    curveTo(11.0f, 5.657f, 9.656f, 7.0f, 8.0f, 7.0f)
                    curveTo(6.343f, 7.0f, 5.0f, 5.657f, 5.0f, 4.0f)
                    curveTo(5.0f, 2.343f, 6.343f, 1.0f, 8.0f, 1.0f)
                    curveTo(9.656f, 1.0f, 11.0f, 2.343f, 11.0f, 4.0f)
                    close()
                    moveTo(10.0f, 4.0f)
                    curveTo(10.0f, 5.105f, 9.104f, 6.0f, 8.0f, 6.0f)
                    curveTo(6.895f, 6.0f, 6.0f, 5.105f, 6.0f, 4.0f)
                    curveTo(6.0f, 2.895f, 6.895f, 2.0f, 8.0f, 2.0f)
                    curveTo(9.104f, 2.0f, 10.0f, 2.895f, 10.0f, 4.0f)
                    close()
                }
                path(
                    fill = SolidColor(onSurfaceColor),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd,
                ) {
                    moveTo(8.0f, 8.0f)
                    curveTo(3.548f, 8.0f, 2.399f, 11.303f, 2.103f, 13.008f)
                    curveTo(2.008f, 13.552f, 2.447f, 14.0f, 3.0f, 14.0f)
                    horizontalLineTo(13.0f)
                    curveTo(13.552f, 14.0f, 13.991f, 13.552f, 13.897f, 13.008f)
                    curveTo(13.6f, 11.303f, 12.452f, 8.0f, 8.0f, 8.0f)
                    close()
                    moveTo(11.744f, 10.511f)
                    curveTo(12.408f, 11.295f, 12.728f, 12.255f, 12.878f, 13.0f)
                    horizontalLineTo(3.122f)
                    curveTo(3.271f, 12.255f, 3.591f, 11.295f, 4.256f, 10.511f)
                    curveTo(4.94f, 9.704f, 6.058f, 9.0f, 8.0f, 9.0f)
                    curveTo(9.941f, 9.0f, 11.059f, 9.704f, 11.744f, 10.511f)
                    close()
                }
            }.build()
        }
    }


@Preview
@Composable
private fun Preview() {
    MaterialTheme(
        colorScheme = LightTheme.colorScheme
    ) {
        Box(modifier = Modifier.padding(12.dp).background(MaterialTheme.colorScheme.background)) {
            Image(imageVector = User, contentDescription = "")
        }
    }
}
