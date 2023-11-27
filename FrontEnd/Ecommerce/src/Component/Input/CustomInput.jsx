export default function CustomInput({ inputText, inputType, inputId }) {
  return (
    <>
      <div class="form-group">
        <label>{inputText + ': '}</label>
        <input
          type={inputType}
          class="form-control"
          id={inputId}
          placeholder={'Enter ' + inputText}
        />
      </div>
    </>
  );
}
