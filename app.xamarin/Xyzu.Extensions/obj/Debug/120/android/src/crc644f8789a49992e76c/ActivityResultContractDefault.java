package crc644f8789a49992e76c;


public class ActivityResultContractDefault
	extends androidx.activity.result.contract.ActivityResultContract
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_createIntent:(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;:GetCreateIntent_Landroid_content_Context_Ljava_lang_Object_Handler\n" +
			"n_parseResult:(ILandroid/content/Intent;)Ljava/lang/Object;:GetParseResult_ILandroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("AndroidX.Activity.Result.Contract.ActivityResultContractDefault, Xyzu.Extensions", ActivityResultContractDefault.class, __md_methods);
	}


	public ActivityResultContractDefault ()
	{
		super ();
		if (getClass () == ActivityResultContractDefault.class)
			mono.android.TypeManager.Activate ("AndroidX.Activity.Result.Contract.ActivityResultContractDefault, Xyzu.Extensions", "", this, new java.lang.Object[] {  });
	}


	public android.content.Intent createIntent (android.content.Context p0, java.lang.Object p1)
	{
		return n_createIntent (p0, p1);
	}

	private native android.content.Intent n_createIntent (android.content.Context p0, java.lang.Object p1);


	public java.lang.Object parseResult (int p0, android.content.Intent p1)
	{
		return n_parseResult (p0, p1);
	}

	private native java.lang.Object n_parseResult (int p0, android.content.Intent p1);

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
