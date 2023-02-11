package crc649631e0f660cc4797;


public class OnScanCompletedListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.MediaScannerConnection.OnScanCompletedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScanCompleted:(Ljava/lang/String;Landroid/net/Uri;)V:GetOnScanCompleted_Ljava_lang_String_Landroid_net_Uri_Handler:Android.Media.MediaScannerConnection/IOnScanCompletedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Android.Media.OnScanCompletedListener, Xyzu.Extensions", OnScanCompletedListener.class, __md_methods);
	}


	public OnScanCompletedListener ()
	{
		super ();
		if (getClass () == OnScanCompletedListener.class)
			mono.android.TypeManager.Activate ("Android.Media.OnScanCompletedListener, Xyzu.Extensions", "", this, new java.lang.Object[] {  });
	}


	public void onScanCompleted (java.lang.String p0, android.net.Uri p1)
	{
		n_onScanCompleted (p0, p1);
	}

	private native void n_onScanCompleted (java.lang.String p0, android.net.Uri p1);

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
