using Xyzu.Library.Models;

namespace Xyzu.Views.Info
{
	public partial interface IInfoSong : IInfo
	{
		ISong? Song { get; set; }

		void SetSong(ISong? song) { Song = song; }
	}
}
