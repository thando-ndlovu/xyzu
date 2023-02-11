using Xyzu.Library.Models;

namespace Xyzu.Views.InfoEdit
{
	public interface IInfoEditSongLyrics : IInfoEdit
	{
		ISong? Song { get; set; }

		void SetSong(ISong? song) { Song = song; }
	}
}
