
gvc/docs
========


antiquity
---------

*   [antiquity_add.pdf](https://github.com/cinkrupa/gvc/raw/master/docs/model/antiquity_add.pdf)

    The diagram shows the state of an antiquity graph containing 3 commited nodes (Node1, Node2, Node3) after adding 4th Node (Node4), before and after commiting the change.


model
--------

In the following diagrams, graphs on the left side represent the state of the model after performing some operation(s) (add, remove, edit) on nodes or relationships, while the graphs on the right side represent the state of the model after commiting the changes.
Yellow nodes represent commits, orange node represents the current branch, and green node is a special node which points to all nodes in the working copy. It is recreated after each commit (it becomes a yellow node - commit - and a new green node is created and connected to nodes in current head).

*   [add_node.pdf](https://github.com/cinkrupa/gvc/raw/master/docs/model/add_node.pdf)

    Adding a single node without relationships

*   [remove_node.pdf](https://github.com/cinkrupa/gvc/raw/master/docs/model/remove_node.pdf)

    Removing a single node without relationships

*   [remove_node_with_relationship.pdf](https://github.com/cinkrupa/gvc/raw/master/docs/model/remove_node_with_relationship.pdf)

    Removing a single node which has relationships with other nodes

*   [edit_relationship.pdf](https://github.com/cinkrupa/gvc/raw/master/docs/model/edit_relationship.pdf)

    Editing property of an edge. Old version of the edge is marked to be removed and new version is marked to be added. During the commit, the id of the commit is written as property "removed_commit_id" to the old edge and as "added_commit_id" to the new edge to mark the range of commits to which the edge belongs.

*   [edit_node.pdf](https://github.com/cinkrupa/gvc/raw/master/docs/model/edit_node.pdf)

    Editing a node which has relationships with other nodes. The node and all of its relationships are copied.



