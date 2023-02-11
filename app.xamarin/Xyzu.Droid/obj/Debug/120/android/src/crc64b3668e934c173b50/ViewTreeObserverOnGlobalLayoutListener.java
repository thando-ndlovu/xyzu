package crc64b3668e934c173b50;


public class ViewTreeObserverOnGlobalLayoutListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnGlobalLayoutListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGlobalLayout:()V:GetOnGlobalLayoutHandler:Android.Views.ViewTreeObserver/IOnGlobalLayoutListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Android.Views.ViewTreeObserverOnGlobalLayoutListener, Xyzu.Extensions", ViewTreeObserverOnGlobalLayoutListener.class, __md_methods);
	}


	public ViewTreeObserverOnGlobalLayoutListener ()
	{
		super ();
		if (getClass () == ViewTreeObserverOnGlobalLayoutListener.class)
			mono.android.TypeManager.Activate ("Android.Views.ViewTreeObserverOnGlobalLayoutListener, Xyzu.Extensions", "", this, new java.lang.Object[] {  });
	}


	public void onGlobalLayout ()
	{
		n_onGlobalLayout ();
	}

	private native void n_onGlobalLayout ();

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
