package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Player extends User {
    private static HashMap<String, Player> players;

    private int platoAge;
    private int score;
    private double money;
    private ArrayList<String> friends;
    private ArrayList<String> friendRequest;
    private ArrayList<String> favoriteGames;
    private ArrayList<Long> suggestions;
    private ArrayList<String> inbox;
    private ArrayList<Long> gameLogs;

    static {
        players = new HashMap<>();
    }

    public Player(String firstName, String lastName, String username, String password, String email, String phoneNumber) {
        super(firstName, lastName, username, password, email, phoneNumber);
        players.put(username, this);
        this.money = 0;
        this.score = 0;
        this.platoAge = 0;
        this.friends = new ArrayList<>();
        this.friendRequest = new ArrayList<>();
        this.favoriteGames = new ArrayList<>();
        this.suggestions = new ArrayList<>();
        this.inbox = new ArrayList<>();
        this.gameLogs = new ArrayList<>();
    }

    //TODO add process to accept or decline friend

    public void addFriendRequest(String playerID) {
        friendRequest.add(playerID);
    }

    public void removeFriend(Player player) {
        friends.remove(player);
    }

    public void addSuggestion(long suggestionID) {
        suggestions.add(suggestionID);
    }

    public void addMessage(Message message) {
        //TODO
    }

    public static void addPlayers(ArrayList<User> players) {
        for (User p : players) {
            Player.players.put(p.getUsername(), (Player) p);
        }
    }

    public void setPlatoAge(int platoAge) {
        this.platoAge = platoAge;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public void setFavoriteGames(ArrayList<String> favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    public int getPlatoAge() {
        return platoAge;
    }

    public double getMoney() {
        return money;
    }

    public long getScore() {
        return score;
    }

    public static HashMap<String, Player> getPlayers() {
        return players;
    }

    public HashMap<String, Player> getFriends() {
        return friends;
    }

    public HashMap<String, Player> getFriendRequest() {
        return friendRequest;
    }

    public ArrayList<String> getFavoriteGames() {
        return favoriteGames;
    }

    public ArrayList<String> getInbox() {
        return inbox;
    }

    public ArrayList<Long> getSuggestions() {
        return suggestions;
    }

    public ArrayList<Long> getGameLogs() {
        return gameLogs;
    }
}