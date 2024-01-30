import json

def make_actor_dictionary(data):
    actors = {}
    for actor_pair in data:
        actor_0 = actor_pair[0]
        actor_1 = actor_pair[1]
        if actor_0 not in actors:
            actors[actor_0] = []
        if actor_1 not in actors:
            actors[actor_1] = []
        actors[actor_0].append(actor_1)
        actors[actor_1].append(actor_0)
    return actors

def did_x_and_y_act_together(data, actor_id_1, actor_id_2):
    actor_dict = make_actor_dictionary(data)
    return (actor_id_1 in actor_dict[actor_id_2])

def get_actors_with_bacon_number(data, n):
    actor_dict = make_actor_dictionary(data)
    visited = set()
    q = [(4724, 0)]
    result = set()
    while q:
        current_actor, number = q.pop(0)
        if current_actor not in visited:
            visited.add(current_actor)

            if number == n:
                result.add(current_actor)
                continue
            for actor in actor_dict[current_actor]:
                q.append((actor, number + 1))
    
    return result



def get_bacon_path(data, actor_id):
    return get_path(data, 4724, actor_id)
    
    

def get_path(data, actor_id_1, actor_id_2):
    #get path from actor 1 to actor 2
    actor_dict = make_actor_dictionary(data)
    visited = set()
    q = [(actor_id_1, [])]
    result = []
    while q:
        current_actor, path = q.pop(0)
        if current_actor not in visited:
            visited.add(current_actor)
            if current_actor == actor_id_2:
                result = path + [current_actor]
                break
            for actor in actor_dict[current_actor]:
                q.append((actor, path + [current_actor]))
    
    if result == []:
        return None
    return result

def actor_path(data, path):
    #replace all actor ids with actor names
    result = []
    for actor in path:
        result.append(data[str(actor)])
    return result

def make_movie_dictionary(data):
    movie_dict = {}
    for actor_pair in data:
        actor_0 = actor_pair[0]
        actor_1 = actor_pair[1]
        movie_id = actor_pair[2]
        if (actor_0, actor_1) not in movie_dict:
            movie_dict[(actor_0, actor_1)] = [movie_id]
        else:
            movie_dict[(actor_0, actor_1)].append(movie_id)
    
    return movie_dict
    

def get_movie_path(data, id_to_movie, actor_id_1, actor_id_2):
    actor_dict = make_movie_dictionary(data)
    
    actor_path = get_path(data, actor_id_1, actor_id_2)
    
    if actor_path == None:
        return None
    
    result = []
    
    for i in range(len(actor_path) - 1):
        actor_0 = actor_path[i]
        actor_1 = actor_path[i+1]
        movie_id = actor_dict[(actor_0, actor_1)][0]
        result.append(id_to_movie[str(movie_id)])
    
    return actor_path(id_to_movie, result) #reused this function to rename the movies
    
    
    
    
    

if __name__ == '__main__':
    # additional code here will be run only when lab.py is invoked directly
    # (not when imported from test.py), so this is a good place to put code
    # used, for example, to generate the results for the online questions.
    
    with open('resources/IDToName.json', 'r') as f:
        id_to_name = json.load(f)
    
    input = [4724, 46866, 46867, 46866]
    result = actor_path(id_to_name, input)
    
    print(result)
    
    
    with open('resources/large.json', 'r') as f:
        large = json.load(f)
    
    with open('resources/IDToMovie.json', 'r') as f:
        id_to_movie = json.load(f)
        
    #print(make_movie_dictionary(large))
    
    result = get_movie_path(large, id_to_movie, 4724, 46866)
    
    #print(result)
    
    
    pass
