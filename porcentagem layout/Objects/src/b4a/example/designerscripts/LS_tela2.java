package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_tela2{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("painel2").vw.setLeft((int)((0d / 100 * width)));
views.get("painel2").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("painel2").vw.setTop((int)((0d / 100 * height)));
views.get("painel2").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("botaotela2").vw.setWidth((int)((60d / 100 * width)));
views.get("botaotela2").vw.setHeight((int)((views.get("botaotela2").vw.getWidth())));
views.get("botaotela2").vw.setTop((int)((50d / 100 * height)-((views.get("botaotela2").vw.getHeight())/2d)));
//BA.debugLineNum = 25;BA.debugLine="botaoTela2.VerticalCenter = painel2.VerticalCenter"[tela2/General script]
views.get("botaotela2").vw.setTop((int)((views.get("painel2").vw.getTop() + views.get("painel2").vw.getHeight()/2) - (views.get("botaotela2").vw.getHeight() / 2)));
//BA.debugLineNum = 26;BA.debugLine="botaoTela2.HorizontalCenter = painel2.HorizontalCenter"[tela2/General script]
views.get("botaotela2").vw.setLeft((int)((views.get("painel2").vw.getLeft() + views.get("painel2").vw.getWidth()/2) - (views.get("botaotela2").vw.getWidth() / 2)));

}
}