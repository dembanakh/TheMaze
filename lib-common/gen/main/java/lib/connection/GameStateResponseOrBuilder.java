// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: the_maze.proto

package lib.connection;

public interface GameStateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:the_maze.GameStateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .the_maze.PlayerState players = 1;</code>
   */
  java.util.List<lib.connection.PlayerState> 
      getPlayersList();
  /**
   * <code>repeated .the_maze.PlayerState players = 1;</code>
   */
  lib.connection.PlayerState getPlayers(int index);
  /**
   * <code>repeated .the_maze.PlayerState players = 1;</code>
   */
  int getPlayersCount();
  /**
   * <code>repeated .the_maze.PlayerState players = 1;</code>
   */
  java.util.List<? extends lib.connection.PlayerStateOrBuilder> 
      getPlayersOrBuilderList();
  /**
   * <code>repeated .the_maze.PlayerState players = 1;</code>
   */
  lib.connection.PlayerStateOrBuilder getPlayersOrBuilder(
      int index);
}
