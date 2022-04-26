package Section8.j2048;
import java.util.*;
public class j2048Controller
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int DIM = 4;
		j2048Model model = new j2048Model(DIM);
		j2048View view = new j2048View(DIM);
		int[][] board = new int[DIM][DIM];
		model.init(board);
		view.draw(board);
		while (model.hasMove(board))
		{
			System.out.print("Enter your move: ");
			String move = in.nextLine();
			if (!move.equals("w") && !move.equals("a") && !move.equals("s") && !move.equals("d") && !move.equals("q"))
			{
				do
				{
					System.out.print("Enter a move: \'w\' for up, \'a\' for left, \'s\' for down, \'d\' for right, and \'q\' to quit: ");
					move = in.nextLine();
				} while(!move.equals("w") && !move.equals("a") && !move.equals("s") && !move.equals("d") && !move.equals("q"));
			}
			if (move.equals("q")) break;
			else if (move.equals("w")) model.shiftUp(board);
			else if (move.equals("a")) model.shiftLeft(board);
			else if (move.equals("s")) model.shiftDown(board);
			else if (move.equals("d")) model.shiftRight(board);
			model.spawn(board);
			view.draw(board);
		}
		System.out.println("Sorry, you lost!");
	}
}