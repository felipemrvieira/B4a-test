package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_tela1{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 1;BA.debugLine="AutoScaleAll"[tela1/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 9;BA.debugLine="painel1.SetLeftAndRight(0%x,100%x)"[tela1/General script]
views.get("painel1").vw.setLeft((int)((0d / 100 * width)));
views.get("painel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 15;BA.debugLine="painel1.SetTopAndBottom(0%y,100%y)"[tela1/General script]
views.get("painel1").vw.setTop((int)((0d / 100 * height)));
views.get("painel1").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 25;BA.debugLine="painel1.Left = 0%x 'ESQUERDA COMEÇA EM 0 (CANTO ESQUERDO DA TELA)"[tela1/General script]
views.get("painel1").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 26;BA.debugLine="painel1.Width = 100%x 'LARGURA DO PAINEL É DE 100% DA TELA"[tela1/General script]
views.get("painel1").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 30;BA.debugLine="painel1.Top = 0%y"[tela1/General script]
views.get("painel1").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 31;BA.debugLine="painel1.Height = 100%y"[tela1/General script]
views.get("painel1").vw.setHeight((int)((100d / 100 * height)));

}
}