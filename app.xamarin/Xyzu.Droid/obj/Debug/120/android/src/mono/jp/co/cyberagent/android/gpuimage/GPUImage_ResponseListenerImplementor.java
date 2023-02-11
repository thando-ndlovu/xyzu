package mono.jp.co.cyberagent.android.gpuimage;


public class GPUImage_ResponseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		jp.co.cyberagent.android.gpuimage.GPUImage.ResponseListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_response:(Ljava/lang/Object;)V:GetResponse_Ljava_lang_Object_Handler:JP.CyberAgent.GpuImageLib.GPUImage/IResponseListenerInvoker, CyberAgentGpuImageLibrary\n" +
			"";
		mono.android.Runtime.register ("JP.CyberAgent.GpuImageLib.GPUImage+IResponseListenerImplementor, CyberAgentGpuImageLibrary", GPUImage_ResponseListenerImplementor.class, __md_methods);
	}


	public GPUImage_ResponseListenerImplementor ()
	{
		super ();
		if (getClass () == GPUImage_ResponseListenerImplementor.class)
			mono.android.TypeManager.Activate ("JP.CyberAgent.GpuImageLib.GPUImage+IResponseListenerImplementor, CyberAgentGpuImageLibrary", "", this, new java.lang.Object[] {  });
	}


	public void response (java.lang.Object p0)
	{
		n_response (p0);
	}

	private native void n_response (java.lang.Object p0);

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
