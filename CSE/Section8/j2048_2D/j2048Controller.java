package Section8.j2048_2D;
import java.util.*;
public class j2048Controller
{
	public static void main(String[] args)
	{
		int DIM = 4;
		j2048Model model = new j2048Model(DIM);
		j2048View view = new j2048View(DIM);
		int[][] board = new int[DIM][DIM];
		model.init(board);
		view.draw(board, model.getScore());
		while (model.hasMove(board))
		{
			String move = view.getMove();
			boolean moved = false;
			if (move.equals("q")) break;
			else if (move.equals("w")) moved = model.shiftUp(board);
			else if (move.equals("a")) moved = model.shiftLeft(board);
			else if (move.equals("s")) moved = model.shiftDown(board);
			else if (move.equals("d")) moved = model.shiftRight(board);
			if (moved)
			{
				model.spawn(board);
				view.draw(board, model.getScore());
			}
		}
		view.gameOver(model.getScore());
	}
}