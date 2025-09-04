DIRECTIONS = [(-1, -1), (-1, 0), (-1, 1),
              (0, -1),           (0, 1),
              (1, -1),  (1, 0),  (1, 1)]

def annotate(garden):
    if not garden:
        return []
    expected_cols = len(garden[0])
    for row in garden:
        if len(row) != expected_cols:
            raise ValueError("The board is invalid with current input.")
        for char in row:
            if char not in [' ', '*']:
                raise ValueError("The board is invalid with current input.")

    rows = len(garden)
    cols = expected_cols
    result = []
    for r in range(rows):
        line = ""
        for c in range(cols):
            if garden[r][c] == "*":
                line += "*"
            else:
                count = 0
                for dr, dc in DIRECTIONS:
                    nr, nc = r + dr, c + dc
                    if 0 <= nr < rows and 0 <= nc < cols and garden[nr][nc] == "*":
                        count += 1
                line += str(count) if count else " "
        result.append(line)
    return result
