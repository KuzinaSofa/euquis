private class example {
    // Repository name
    private String repoName;
    // Repository owner
    private String owner;
    // Number of stars
    private int stars;
    // Number of forks
    private int forks;

    // Constructor to initialize the example object
    public example(String repoName, String owner, int stars, int forks) {
        this.repoName = repoName;
        this.owner = owner;
        this.stars = stars;
        this.forks = forks;
    }

    // Getters and Setters for each field
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    // Method to display repository information
    public void displayInfo() {
        System.out.println("Repository Name: " + repoName);
        System.out.println("Owner: " + owner);
        System.out.println("Stars: " + stars);
        System.out.println("Forks: " + forks);
    }
}
