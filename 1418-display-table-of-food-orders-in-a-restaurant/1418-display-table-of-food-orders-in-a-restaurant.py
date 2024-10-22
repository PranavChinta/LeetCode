class Solution:
    def displayTable(self, orders: List[List[str]]) -> List[List[str]]:
        displayMap = defaultdict(Counter)
        items = set()
        for order in orders:
            table = int(order[1])
            displayMap[table][order[2]] += 1
            items.add(order[2])
        
        display = []
        itemList = sorted(list(items))
        display.append(["Table"]+itemList)
        tableList = sorted(list(displayMap.keys()))
        
        for table in tableList:
            row = []
            row.append(str(table))
            for item in itemList:
                row.append(str(displayMap[table][item]))
            display.append(row)

        return display