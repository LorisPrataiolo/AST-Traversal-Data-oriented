package ast_traversal_operation_oriented.ast_traversal_operation_oriented;

import static java.util.Objects.requireNonNull;


// this class is for '-' Exp ---> Exp is an AST
public class SignExp implements AST {
	private final AST exp;

	public SignExp(AST exp) {
		this.exp = requireNonNull(exp);
	}


	@Override
	public <T> T accept(Visitor<T> v) {
		return null;
	}
}
