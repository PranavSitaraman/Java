package Section8.j2048_1D;
import java.util.*;
public class j2048Controller
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int DIM = 4;
		j2048Model model = new j2048Model(DIM);
		j2048View view = new j2048View(DIM);
		int[] board = new int[DIM];
		model.init(board);
		System.out.println("Current score: " + model.getScore());
		view.draw(board);
		while (model.hasMove(board))
		{
			System.out.print("Move: ");
			String move = in.nextLine();
			if (!move.equals("a") && !move.equals("d") && !move.equals("q"))
			{
				do
				{
					System.out.print("Enter a move: \'a\' for left, \'d\' for right, and \'q\' to quit: ");
					move = in.nextLine();
				} while(!move.equals("a") && !move.equals("d") && !move.equals("q"));
			}
			boolean moved = false;
			if (move.equals("q")) break;
			else if (move.equals("a")) moved = model.shiftLeft(board);
			else if (move.equals("d")) moved = model.shiftRight(board);
			if (moved)
			{
				model.spawn(board);
				System.out.println("Current score: " + model.getScore());
				view.draw(board);
			}
		}
		System.out.println("Game over!");
	}
}