package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_tela3{

public static void LS_320x480_1(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("button1").vw.setLeft((int)((10d / 100 * width)));
views.get("button1").vw.setTop((int)((5d / 100 * height)));
views.get("button1").vw.setHeight((int)((15d / 100 * height) - ((5d / 100 * height))));
views.get("button2").vw.setLeft((int)((30d / 100 * width)));
views.get("button2").vw.setTop((int)((5d / 100 * height)));
views.get("button2").vw.setHeight((int)((15d / 100 * height) - ((5d / 100 * height))));

}
public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("painel3").vw.setLeft((int)((0d / 100 * width)));
views.get("painel3").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("painel3").vw.setTop((int)((0d / 100 * height)));
views.get("painel3").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("button1").vw.setLeft((int)((10d / 100 * width)));
views.get("button1").vw.setTop((int)((5d / 100 * height)));
views.get("button1").vw.setHeight((int)((15d / 100 * height) - ((5d / 100 * height))));
views.get("button2").vw.setLeft((int)((30d / 100 * width)));
views.get("button2").vw.setTop((int)((5d / 100 * height)));
views.get("button2").vw.setHeight((int)((15d / 100 * height) - ((5d / 100 * height))));
//BA.debugLineNum = 17;BA.debugLine="Button3.SetLeftAndRight(20%X,80%X)"[tela3/General script]
views.get("button3").vw.setLeft((int)((20d / 100 * width)));
views.get("button3").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 18;BA.debugLine="Button3.SetTopAndBottom(Button2.Bottom + 5%Y,Button2.Bottom + 5%Y + Button2.Height)"[tela3/General script]
views.get("button3").vw.setTop((int)((views.get("button2").vw.getTop() + views.get("button2").vw.getHeight())+(5d / 100 * height)));
views.get("button3").vw.setHeight((int)((views.get("button2").vw.getTop() + views.get("button2").vw.getHeight())+(5d / 100 * height)+(views.get("button2").vw.getHeight()) - ((views.get("button2").vw.getTop() + views.get("button2").vw.getHeight())+(5d / 100 * height))));
//BA.debugLineNum = 20;BA.debugLine="Button4.SetLeftAndRight(20%X,80%X)"[tela3/General script]
views.get("button4").vw.setLeft((int)((20d / 100 * width)));
views.get("button4").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 21;BA.debugLine="Button4.SetTopAndBottom(Button3.Bottom + 5%Y,Button3.Bottom + 5%Y + Button3.Height)"[tela3/General script]
views.get("button4").vw.setTop((int)((views.get("button3").vw.getTop() + views.get("button3").vw.getHeight())+(5d / 100 * height)));
views.get("button4").vw.setHeight((int)((views.get("button3").vw.getTop() + views.get("button3").vw.getHeight())+(5d / 100 * height)+(views.get("button3").vw.getHeight()) - ((views.get("button3").vw.getTop() + views.get("button3").vw.getHeight())+(5d / 100 * height))));
//BA.debugLineNum = 24;BA.debugLine="Button5.SetLeftAndRight(Button4.Left,Button4.Right)"[tela3/General script]
views.get("button5").vw.setLeft((int)((views.get("button4").vw.getLeft())));
views.get("button5").vw.setWidth((int)((views.get("button4").vw.getLeft() + views.get("button4").vw.getWidth()) - ((views.get("button4").vw.getLeft()))));
//BA.debugLineNum = 25;BA.debugLine="Button5.SetTopAndBottom(Button4.Bottom + 5%Y,Button4.Bottom + 5%Y + Button4.Height)"[tela3/General script]
views.get("button5").vw.setTop((int)((views.get("button4").vw.getTop() + views.get("button4").vw.getHeight())+(5d / 100 * height)));
views.get("button5").vw.setHeight((int)((views.get("button4").vw.getTop() + views.get("button4").vw.getHeight())+(5d / 100 * height)+(views.get("button4").vw.getHeight()) - ((views.get("button4").vw.getTop() + views.get("button4").vw.getHeight())+(5d / 100 * height))));
//BA.debugLineNum = 28;BA.debugLine="Button6.SetLeftAndRight(Button5.Left,Button5.Right)"[tela3/General script]
views.get("button6").vw.setLeft((int)((views.get("button5").vw.getLeft())));
views.get("button6").vw.setWidth((int)((views.get("button5").vw.getLeft() + views.get("button5").vw.getWidth()) - ((views.get("button5").vw.getLeft()))));
//BA.debugLineNum = 29;BA.debugLine="Button6.SetTopAndBottom(Button5.Bottom + 5%Y,Button6.Top + Button5.Height)"[tela3/General script]
views.get("button6").vw.setTop((int)((views.get("button5").vw.getTop() + views.get("button5").vw.getHeight())+(5d / 100 * height)));
views.get("button6").vw.setHeight((int)((views.get("button6").vw.getTop())+(views.get("button5").vw.getHeight()) - ((views.get("button5").vw.getTop() + views.get("button5").vw.getHeight())+(5d / 100 * height))));

}
}