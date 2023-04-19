package ast_traversal_operation_oriented.ast_traversal_operation_oriented;


// this calass is for the type node ---> int ---> leaf of AST
public class IntLiteral implements AST {

	private final int value;



	public IntLiteral(int value) {
		this.value = value;
	}

	@Override
	public <T> T accept(Visitor<T> v) {
		return v.IntLiteral(value);
	}

}
