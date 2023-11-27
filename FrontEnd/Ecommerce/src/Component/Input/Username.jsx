export default function Username() {
  return (
    <>
      <div class="form-group">
        <label>Username: </label>
        <input
          type="text"
          class="form-control"
          id="exampleInputEmail1"
          aria-describedby="emailHelp"
          placeholder="Enter Username"
        />
        <br />
        {/* <small id="emailHelp" class="form-text text-muted">
          We'll never share your email with anyone else.
        </small> */}
      </div>
    </>
  );
}
