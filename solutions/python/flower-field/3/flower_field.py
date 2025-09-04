def annotate(garden):
    if not garden or len(garden) == 0:
        return []
    expected_cols = len(garden[0])
    for row in garden:
        if len(row) != expected_cols:
            raise ValueError("The board is invalid with current input.")
        for char in row:
            if char not in [' ', '*']:
                raise ValueError("The board is invalid with current input.")
    rows, cols = len(garden), expected_cols
    board = [list(row) for row in garden]
    for r in range(rows):
        for c in range(cols):
            if board[r][c] == "*":
                for dr in [-1, 0, 1]:
                    for dc in [-1, 0, 1]:
                        nr, nc = r + dr, c + dc
                        if dr == dc == 0:
                            continue
                        if 0 <= nr < rows and 0 <= nc < cols and board[nr][nc] != "*":
                            if board[nr][nc] == " ":
                                board[nr][nc] = 1
                            else:
                                board[nr][nc] += 1
    for r in range(rows):
        for c in range(cols):
            if isinstance(board[r][c], int):
                board[r][c] = str(board[r][c])
    return ["".join(row) for row in board]
