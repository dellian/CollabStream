package collabstream.streaming;

public enum MsgType {
	END_OF_DATA,
	TRAINING_EXAMPLE,
	PROCESS_BLOCK_REQ,
	PROCESS_BLOCK_FIN,
	USER_BLOCK_REQ,
	ITEM_BLOCK_REQ,
	USER_BLOCK,
	ITEM_BLOCK
}