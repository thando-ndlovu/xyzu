package crc649edf902858c8c504;


public class PanelSlideListener
	extends com.sothree.slidinguppanel.SlidingUpPanelLayout.SimplePanelSlideListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPanelSlide:(Landroid/view/View;F)V:GetOnPanelSlide_Landroid_view_View_FHandler\n" +
			"n_onPanelStateChanged:(Landroid/view/View;Lcom/sothree/slidinguppanel/SlidingUpPanelLayout$PanelState;Lcom/sothree/slidinguppanel/SlidingUpPanelLayout$PanelState;)V:GetOnPanelStateChanged_Landroid_view_View_Lcom_sothree_slidinguppanel_SlidingUpPanelLayout_PanelState_Lcom_sothree_slidinguppanel_SlidingUpPanelLayout_PanelState_Handler\n" +
			"";
		mono.android.Runtime.register ("Com.Sothree.Slidinguppanel.PanelSlideListener, Xyzu.Droid", PanelSlideListener.class, __md_methods);
	}


	public PanelSlideListener ()
	{
		super ();
		if (getClass () == PanelSlideListener.class)
			mono.android.TypeManager.Activate ("Com.Sothree.Slidinguppanel.PanelSlideListener, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onPanelSlide (android.view.View p0, float p1)
	{
		n_onPanelSlide (p0, p1);
	}

	private native void n_onPanelSlide (android.view.View p0, float p1);


	public void onPanelStateChanged (android.view.View p0, com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState p1, com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState p2)
	{
		n_onPanelStateChanged (p0, p1, p2);
	}

	private native void n_onPanelStateChanged (android.view.View p0, com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState p1, com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
