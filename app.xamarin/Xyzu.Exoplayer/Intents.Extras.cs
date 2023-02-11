#nullable enable

namespace Xyzu.Player
{
	public static partial class Intents
	{
		public static partial class Extras
		{
			public static class Seek
			{
				public const string Millisecond_Long = "com.xyclonedesigns.xyzu.action.extra.SEEK_MILLISECOND_LONG";
			}
			public static class Skip
			{
				public const string QueueIndex_Int = "com.xyclonedesigns.xyzu.action.extra.SKIP_QUEUE_INDEX_INT";
			}
		}
	}
}