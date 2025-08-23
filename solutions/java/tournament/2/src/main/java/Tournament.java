import java.util.*;

class Tournament {
    private String output;

    String printTable() {
        if (output == null) {
            output = "Team                           | MP |  W |  D |  L |  P\n";
        }
        return output;
    }

    void applyResults(String resultString) {
        output = "Team                           | MP |  W |  D |  L |  P\n";
        String[] resultArray = resultString.split("[;\n]");
        int n = 0;
        Map<String, List<Integer>> map = new HashMap<>();        
        while (n < resultArray.length) {
            if (resultArray[n + 2].equals("win")) {
                List<Integer> team1Stats = getOrInitializeTeamStats(map, resultArray[n]);
                List<Integer> updatedTeam1Stats = handleTable(team1Stats.get(0) + 1, team1Stats.get(1) + 1, team1Stats.get(2), team1Stats.get(3));
                map.put(resultArray[n], updatedTeam1Stats);
                
                List<Integer> team2Stats = getOrInitializeTeamStats(map, resultArray[n + 1]);
                List<Integer> updatedTeam2Stats = handleTable(team2Stats.get(0) + 1, team2Stats.get(1), team2Stats.get(2), team2Stats.get(3) + 1);
                map.put(resultArray[n + 1], updatedTeam2Stats);
            } else if (resultArray[n + 2].equals("loss")) {
                List<Integer> team1Stats = getOrInitializeTeamStats(map, resultArray[n]);
                List<Integer> updatedTeam1Stats = handleTable(team1Stats.get(0) + 1, team1Stats.get(1), team1Stats.get(2), team1Stats.get(3) + 1);
                map.put(resultArray[n], updatedTeam1Stats);
                
                List<Integer> team2Stats = getOrInitializeTeamStats(map, resultArray[n + 1]);
                List<Integer> updatedTeam2Stats = handleTable(team2Stats.get(0) + 1, team2Stats.get(1) + 1, team2Stats.get(2), team2Stats.get(3));
                map.put(resultArray[n + 1], updatedTeam2Stats);
            } else if (resultArray[n + 2].equals("draw")) {
                List<Integer> team1Stats = getOrInitializeTeamStats(map, resultArray[n]);
                List<Integer> updatedTeam1Stats = handleTable(team1Stats.get(0) + 1, team1Stats.get(1), team1Stats.get(2) + 1, team1Stats.get(3));
                map.put(resultArray[n], updatedTeam1Stats);
                
                List<Integer> team2Stats = getOrInitializeTeamStats(map, resultArray[n + 1]);
                List<Integer> updatedTeam2Stats = handleTable(team2Stats.get(0) + 1, team2Stats.get(1), team2Stats.get(2) + 1, team2Stats.get(3));
                map.put(resultArray[n + 1], updatedTeam2Stats);
            }
            n += 3;
        }
        List<Map.Entry<String, List<Integer>>> sortedTeams = new ArrayList<>(map.entrySet());
        sortedTeams.sort((entry1, entry2) -> {
            int points1 = entry1.getValue().get(4);
            int points2 = entry2.getValue().get(4);
            if (points1 != points2) {
                return Integer.compare(points2, points1);
            }
            return entry1.getKey().compareTo(entry2.getKey());
        });
        
        for (Map.Entry<String, List<Integer>> entry : sortedTeams) {
            String teamName = entry.getKey();
            List<Integer> stats = entry.getValue();
            output += String.format("%-30s | %2d | %2d | %2d | %2d | %2d\n", 
                teamName, stats.get(0), stats.get(1), stats.get(2), stats.get(3), stats.get(4));
        }
    }

    private List<Integer> getOrInitializeTeamStats(Map<String, List<Integer>> map, String teamName) {
        if (!map.containsKey(teamName)) {
            return handleTable(0, 0, 0, 0);
        } else {
            return map.get(teamName);
        }
    }

    List<Integer> handleTable(int mp, int w, int d, int l) {
        List<Integer> list = new ArrayList<>();
        int p = 3 * w + d; 
        list.add(mp);
        list.add(w);
        list.add(d);
        list.add(l);
        list.add(p);
        return list;
    }
}