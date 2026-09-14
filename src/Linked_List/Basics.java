// A Singly Linked List is a linear data structure.
// It consists of multiple nodes.
// Each node contains two parts:
// Data → stores the actual value.
// Next → stores the reference/address of the next node.
// The first node is called the Head.
// The next of the last node contains null, because there is no next node.
// Nodes are not stored in contiguous memory locations like arrays.
// Nodes are connected using references/pointers.
//                      Node 1          Node 2          Node 3
    //   ┌────────┐      ┌────────┐      ┌────────┐
    //   │ data   │      │ data   │      │ data   │
    //   │ next ──┼─────>│ next ──┼─────>│ next ──┼──> null
    //   └────────┘      └────────┘      └────────┘
    //       ↑
    //     Head
