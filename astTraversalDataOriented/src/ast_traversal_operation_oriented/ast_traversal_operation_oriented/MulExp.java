package ast_traversal_operation_oriented.ast_traversal_operation_oriented;

import static java.util.Objects.requireNonNull;


// this class is fore type node --> '*' ---> so we must have for the left child an Exp. and for the right child too
public class MulExp implements AST {
	private final AST left, right;

	public MulExp(AST left, AST right) {
		this.left = requireNonNull(left);
		this.right = requireNonNull(right);
	}

	@Override
	public <T> T accept(Visitor<T> v) {
		return null;
	}



}
