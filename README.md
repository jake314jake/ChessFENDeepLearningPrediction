# ChessFENDeepLearningPrediction
## Context

The goal of the project is to build a model able to generate FEN description based on a schematic image of a chess board.
## What Is FEN?
FEN is the abbreviation of Forsyth-Edwards Notation, and it is the standard notation to describe positions of a chess game. Steven J. Edwards, a computer programmer, created this notation system based on another system designed by the journalist David Forsyth. Edwards modified the older notation system so that chess software could use it.
## How Does FEN Work?
FEN sequences are composed exclusively of ASCII characters so computers can recognize them. These strings have six different fields, each describing one aspect of a position and separated by a space character.
### Piece placement data: 
Each rank is described, starting with rank 8 and ending with rank 1, with a "/" between each one; within each rank, the contents of the squares are described in order from the a-file to the h-file. Each piece is identified by a single letter taken from the standard English names in algebraic notation (pawn = "P", knight = "N", bishop = "B", rook = "R", queen = "Q" and king = "K"). White pieces are designated using uppercase letters ("PNBRQK"), while black pieces use lowercase letters ("pnbrqk"). A set of one or more consecutive empty squares within a rank is denoted by a digit from "1" to "8", corresponding to the number of squares.

### Active color:
"w" means that White is to move; "b" means that Black is to move.

#### (...)
## Examples 
white to play
### rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w
![phprLkH4s](https://user-images.githubusercontent.com/90989827/212181438-eb314a58-2857-43d7-9ef9-16d9961c41a2.png)



